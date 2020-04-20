import {TestBed} from '@angular/core/testing';

import {UploadFunctionService} from './upload-function.service';

describe('UploadFunctionService', () => {
  let service: UploadFunctionService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UploadFunctionService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
