'use strict';

/**
 * @ngdoc function
 * @name genesisApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the genesisApp
 */
angular.module('genesisApp')
  .controller('MainCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
