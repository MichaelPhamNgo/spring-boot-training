import { TestBed } from '@angular/core/testing';

import { NumbersObservableService } from './numbers-observable.service';

describe('NumbersObservableService', () => {
  let service: NumbersObservableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumbersObservableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
