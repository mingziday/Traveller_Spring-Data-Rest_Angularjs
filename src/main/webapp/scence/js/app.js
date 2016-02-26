/**
 * Created by travelfish on 01/06/14.
 */

angular.module('scenceApp',['ui.router','ng.ueditor','scenceApp.controllers']);

angular.module('scenceApp')
.config(function($stateProvider,$httpProvider){
    $stateProvider.state('Scences',{
        url:'/scences',
        templateUrl:'scence/partials/scences.html',
        controller:'scenceFrontController'
    }).state('viewScence',{
       url:'/scences/:id/view',
       templateUrl:'scence/partials/scence-view.html',
       controller:'scenceViewController'
    }).state('newScence',{
        url:'/scences/new',
        templateUrl:'scence/partials/scence-new.html',
        controller:'scenceCreateController'
    }).state('successScence',{
        url:'/scences/scuess',
        templateUrl:'scence/partials/scence-success.html',
        controller:'scenceSuccessController'
    }).state('editScence',{
        url:'/scences/:id/edit',
        templateUrl:'scence/partials/scence-edit.html',
        controller:'scenceEditController'
    }).state('listScence',{
        url:'/scences/list',
        templateUrl:'scence/partials/scence-list.html',
        controller:'scenceListController'
    });    

})
.run(function($state){
   $state.go('Scences');
});