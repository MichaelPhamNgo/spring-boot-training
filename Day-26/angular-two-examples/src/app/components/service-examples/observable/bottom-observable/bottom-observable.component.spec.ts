import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BottomObservableComponent } from './bottom-observable.component';

describe('BottomObservableComponent', () => {
  let component: BottomObservableComponent;
  let fixture: ComponentFixture<BottomObservableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BottomObservableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BottomObservableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
