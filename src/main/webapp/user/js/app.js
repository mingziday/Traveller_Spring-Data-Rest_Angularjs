/**
 * Created by travelfish on 01/06/14.
 */

angular.module('userApp',['ui.router','ngResource']);

angular.module('userApp')
.config(function($stateProvider,$httpProvider){
    $stateProvider.state('Users',{
        url:'/users',
        templateUrl:'user/partials/users.html',
       // controller:'userListController'
    }).state('login',{
       url:'/users/login',
       templateUrl:'user/partials/login.html',
      // controller:'userViewController'
    }).state('register',{
        url:'/users/register',
        templateUrl:'user/partials/register.html',
      //  controller:'userCreateController'
    });

})
.run(function($state){
   $state.go('Users');
});