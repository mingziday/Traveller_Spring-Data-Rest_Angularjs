/**
 * Created by Sandeep on 01/06/14.
 */
angular.module('userApp.controllers',['travellerApp.services','ngSanitize'])

.controller('userListController',function($scope,$state,travellerService){
    $scope.getusers = function(number){
        travellerService.setBaseUrl("users");
        travellerService.fetchPage(number).then(function(data) {
                $scope.users = data;
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
            $scope.getusers($scope.page+1);
        }
    };
    $scope.show_previous = function() {
        if ($scope.less) {
            $scope.getusers($scope.page-1);
        }
    };
    $scope.getusers(1);
 
})

.controller('userViewController',function($scope,travellerService,$stateParams, $sce){
    travellerService.setBaseUrl("users");
    travellerService.fetchOne($stateParams.id).then(function(data) {
        $scope.user = data;
        //$scope.user.info = $sce.trustAsHtml(data.info);
     });
})
.controller('userEditController',function($scope,$stateParams){
    //console.log($rootScope.user.name);
    //$scope.user = userService.get({id:$stateParams.id});

})
.controller('userRegistController',function($scope,travellerService,$stateParams){
    //console.log($rootScope.user.name);
    travellerService.setBaseUrl("users");
    /*ʹ��angularjs��˫��󶨹����Զ���ȡ*/
    $scope.user = {};
    $scope.newUser = function(){
        travellerService.saveOne($scope.user).then(
            function(data) {
            console.log("ok");//�ɹ�
            //$scope.user = data;
            },
            function(data) {
            console.log("error");//ʧ��
            //$scope.user = data;
            }
     );
    };//����function

});//����controller

/*
 angular.forEach($scope.users, function (item){
            console.log(item.name);
        });

 console.log(reports.length);

 debugger;
*/