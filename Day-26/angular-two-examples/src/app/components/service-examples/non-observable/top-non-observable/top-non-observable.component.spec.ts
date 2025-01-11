import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TopNonObservableComponent } from './top-non-observable.component';

describe('TopNonObservableComponent', () => {
  let component: TopNonObservableComponent;
  let fixture: ComponentFixture<TopNonObservableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TopNonObservableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TopNonObservableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
