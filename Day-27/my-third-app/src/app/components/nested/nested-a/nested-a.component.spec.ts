import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NestedAComponent } from './nested-a.component';

describe('NestedAComponent', () => {
  let component: NestedAComponent;
  let fixture: ComponentFixture<NestedAComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NestedAComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NestedAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
