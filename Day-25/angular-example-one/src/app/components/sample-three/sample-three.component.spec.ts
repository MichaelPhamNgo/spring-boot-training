import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SampleThreeComponent } from './sample-three.component';

describe('SampleThreeComponent', () => {
  let component: SampleThreeComponent;
  let fixture: ComponentFixture<SampleThreeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SampleThreeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SampleThreeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
