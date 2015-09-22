/**
 * Created by travelfish on 01/06/14.
 */

angular.module('scenceApp',['ui.router','ng.ueditor','scenceApp.controllers']);

angular.module('scenceApp')
.config(function($stateProvider,$httpProvider){
    $stateProvider.state('Scences',{
        url:'/scences',
        templateUrl:'scence/partials/scences.html',
        controller:'scenceListController'
    }).state('viewScence',{
       url:'/scences/:id/view',
       templateUrl:'scence/partials/scence-view.html',
       controller:'scenceViewController'
    }).state('newScence',{
        url:'/scences/new',
        templateUrl:'scence/partials/scence-new.html',
        controller:'scenceCreateController'
    }).state('editScence',{
        url:'/scences/:id/edit',
        templateUrl:'scence/partials/scence-edit.html',
        controller:'scenceEditController'
    });    

})
.run(function($state){
   $state.go('Scences');
});