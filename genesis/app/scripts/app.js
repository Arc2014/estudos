'use strict';

/**
 * @ngdoc overview
 * @name genesisApp
 * @description
 * # genesisApp
 *
 * Main module of the application.
 */
angular
  .module('genesisApp', [
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/primeira-rota', {
        templateUrl: 'views/primeira-rota.html',
        controller: 'PrimeiraRotaCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
