import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TopObservableComponent } from './top-observable.component';

describe('TopObservableComponent', () => {
  let component: TopObservableComponent;
  let fixture: ComponentFixture<TopObservableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TopObservableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TopObservableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
