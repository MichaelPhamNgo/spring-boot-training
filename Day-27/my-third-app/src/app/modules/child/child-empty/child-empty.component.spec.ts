import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildEmptyComponent } from './child-empty.component';

describe('ChildEmptyComponent', () => {
  let component: ChildEmptyComponent;
  let fixture: ComponentFixture<ChildEmptyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildEmptyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildEmptyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
