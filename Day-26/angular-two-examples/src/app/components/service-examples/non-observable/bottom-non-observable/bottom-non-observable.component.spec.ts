import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BottomNonObservableComponent } from './bottom-non-observable.component';

describe('BottomNonObservableComponent', () => {
  let component: BottomNonObservableComponent;
  let fixture: ComponentFixture<BottomNonObservableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BottomNonObservableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BottomNonObservableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
