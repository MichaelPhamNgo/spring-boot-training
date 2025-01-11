import { TestBed } from '@angular/core/testing';

import { NumbersNonObservableService } from './numbers-non-observable.service';

describe('NumbersNonObservableService', () => {
  let service: NumbersNonObservableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumbersNonObservableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
