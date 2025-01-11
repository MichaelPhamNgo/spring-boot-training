import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildNestedComponent } from './child-nested.component';

describe('ChildNestedComponent', () => {
  let component: ChildNestedComponent;
  let fixture: ComponentFixture<ChildNestedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildNestedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildNestedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
