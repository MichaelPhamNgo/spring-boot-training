import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NestedBComponent } from './nested-b.component';

describe('NestedBComponent', () => {
  let component: NestedBComponent;
  let fixture: ComponentFixture<NestedBComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NestedBComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NestedBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
