'use strict';

describe('Controller: PrimeiraRotaCtrl', function () {

  // load the controller's module
  beforeEach(module('genesisApp'));

  var PrimeiraRotaCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PrimeiraRotaCtrl = $controller('PrimeiraRotaCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(scope.awesomeThings.length).toBe(3);
  });
});
