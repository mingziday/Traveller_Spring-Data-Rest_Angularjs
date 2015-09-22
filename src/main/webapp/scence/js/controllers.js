/**
 * Created by Sandeep on 01/06/14.
 */
angular.module('scenceApp.controllers',['travellerApp.services','ngSanitize'])

.controller('scenceListController',function($scope,$state,travellerService){
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
.controller('scenceEditController',function($scope,$stateParams){
    //console.log($rootScope.scence.name);
    //$scope.scence = ScenceService.get({id:$stateParams.id});

})
.controller('scenceCreateController',function($scope,$stateParams){
    //console.log($rootScope.scence.name);
    //$scope.scence = ScenceService.get({id:$stateParams.id});

});

/*
 angular.forEach($scope.scences, function (item){
            console.log(item.name);
        });

 console.log(reports.length);
*/