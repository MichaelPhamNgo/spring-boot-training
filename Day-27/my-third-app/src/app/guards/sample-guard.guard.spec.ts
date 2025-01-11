import { TestBed, async, inject } from '@angular/core/testing';

import { SampleGuardGuard } from './sample-guard.guard';

describe('SampleGuardGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SampleGuardGuard]
    });
  });

  it('should ...', inject([SampleGuardGuard], (guard: SampleGuardGuard) => {
    expect(guard).toBeTruthy();
  }));
});
