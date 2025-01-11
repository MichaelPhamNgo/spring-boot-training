import { TestBed } from '@angular/core/testing';

import { HeroInfoService } from './hero-info.service';

describe('HeroInfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: HeroInfoService = TestBed.get(HeroInfoService);
    expect(service).toBeTruthy();
  });
});
