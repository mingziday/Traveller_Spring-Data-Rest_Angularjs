/**
 * Created by travellfish on 01/06/14.
 */
angular.module('travellerApp.services',['restangular'])

.config(function(RestangularProvider){
	 RestangularProvider.setBaseUrl('./traveller');
	 RestangularProvider.addResponseInterceptor(function(data, operation, route) {
        var returnData;
        if (route.indexOf("/") > 0)
        {
            route = route.substring(0,route.indexOf("/"));
        }
        if (operation === 'getList' && data._embedded) {
             returnData = data._embedded[route];
             
             /*不再需要重新设置id
             angular.forEach(returnData, function(item){
                var href = item._links.self.href;
                item.id = href.substring(href.lastIndexOf("/")+1);
             });
            */

            if (!returnData) {
                returnData = data._embedded[Object.keys(data._embedded)[0]];
            }
            //if there is pagination info make it one-based.
            if (data.page) {
                returnData.page = data.page;
                returnData.page.number = returnData.page.number + 1;
            }
        } 
        else if (operation === 'getList' && !data._embedded) {
            returnData = [];
            returnData.page = data.page;
        } 
        else {
            returnData = data;
        }
        return returnData;
    });
  })
.service('travellerService',function(Restangular){
	var baseurl = "./traveller";
	this.setBaseUrl = function(url){
		baseurl = url;
	};
	//按页获取
	this.fetchPage = function(number){
      return  Restangular.all(baseurl).getList({page : number-1});
     };
    //获取单个
	this.fetchOne = function(id){
	  return Restangular.one(baseurl,id).get();
	};
    //获取所有
    this.fetchAll = function(){
      return Restangular.all(baseurl).getList();
    };
    //新建对象
    this.saveOne = function(item){
      //console.log(item);
      return Restangular.all(baseurl).post(item);
    }
    
})
.service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});

