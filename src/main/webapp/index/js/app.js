angular
.module('indexApp', ['travellerApp.services'])
//获取用户信息的服务
.controller('UsersController', function ($scope, travellerService) {
    $scope.getUsers = function(){
        travellerService.setBaseUrl("users");
        travellerService.fetchAll().then(function(data) {
            $scope.users = data;
        })
   
    };
    $scope.getUsers();
    
    
})
    //获取景点信息的服务
.controller('ScencesController', function ($scope,travellerService){
    //$scope.scences = ScencesService.getAll();
	$scope.showing = false;
    $scope.getTopScences = function(){
        travellerService.setBaseUrl("scences/search/findFirst4ByOrderByRegdateDesc");
        travellerService.fetchAll().then(function(data) {
            $scope.scences = data;
            $scope.showing = true;
            //$('#carousel-example-generic2').carousel();
        })
    };

    $scope.getTopScences();/*执行load查询*/
});