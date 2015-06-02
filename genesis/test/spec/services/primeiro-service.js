'use strict';

describe('Service: primeiroService', function () {

  // load the service's module
  beforeEach(module('genesisApp'));

  // instantiate service
  var primeiroService;
  beforeEach(inject(function (_primeiroService_) {
    primeiroService = _primeiroService_;
  }));

  it('should do something', function () {
    expect(!!primeiroService).toBe(true);
  });

});
