/**
 * Created by mingziday on 01/06/15.
 */
angular.module('scenceApp.controllers',['travellerApp.services','ngSanitize'])

.controller('scenceFrontController',function($scope,$state,travellerService){
    $scope.getScences = function(number){
        travellerService.setBaseUrl("scences");
        travellerService.fetchPage(number).then(function(data) {
                $scope.scences = data;
                $scope.page = data.page.number;
                $scope.more = !(data.page.number === data.page.totalPages);
                $scope.less = !(data.page.number === 1);
            })
       
    };
    $scope.has_more = function() {
        if ($scope.more) {
            return "acitve";
        } else {
            return "disabled";
        }
    };
    $scope.has_less = function() {
        if ($scope.less) {
            return "acitve";
        } else {
            return "disabled";
        }
    };
    $scope.show_next = function() {
        if ($scope.more) {
            $scope.getScences($scope.page+1);
        }
    };
    $scope.show_previous = function() {
        if ($scope.less) {
            $scope.getScences($scope.page-1);
        }
    };
    $scope.getScences(1);
 
})

.controller('scenceViewController',function($scope,travellerService,$stateParams, $sce){
    //console.log($stateParams.id);
    travellerService.setBaseUrl("scences");
    travellerService.fetchOne($stateParams.id).then(function(data) {
        $scope.scence = data;
        $scope.scence.info = $sce.trustAsHtml(data.info);
     });
})
.controller('scenceCreateController',function($scope,travellerService,$stateParams){
     $scope.scence = {};
     $scope.resultError = false;
     /*获取country*/
     $scope.getCountry = function(){
        travellerService.setBaseUrl("countries");
        travellerService.fetchAll().then(function(data) {
                $scope.countries = data;
                $scope.scence.country = data[0].id;//要存储的值
            })
       
    };
    /*保存scence*/
    $scope.newScence = function(){
        travellerService.setBaseUrl("scences");
        travellerService.saveOne($scope.scence).then(
            function(data) {
                console.log("regist success");//成功，路由到res页面
                $state.go('scenceSuccess');
            },
            function(rsponse) {
                $scope.resultError = true;
                $scope.resultErrorMsg="Error with status code"+response.status;//失败，显示失败信息
            }
     );
    };
    $scope.getCountry();
})
.controller('scenceEditController',function($scope,$stateParams){
    //console.log($rootScope.scence.name);
    //$scope.scence = ScenceService.get({id:$stateParams.id});
})
.controller('scenceSuccessController',function($scope,$state){
})
.controller('scenceListController',function($scope,travellerService,$state){
    $scope.getScences = function(){
        travellerService.setBaseUrl("scences");
        travellerService.fetchAll().then(function(data) {
                $scope.scences = data;
            })
       
    };
    $scope.getScences();
});
/*
 angular.forEach($scope.scences, function (item){
            console.log(item.name);
        });

 console.log(reports.length);
*/