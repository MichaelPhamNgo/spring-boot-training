import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgModelGroupExampleComponent } from './ng-model-group-example.component';

describe('NgModelGroupExampleComponent', () => {
  let component: NgModelGroupExampleComponent;
  let fixture: ComponentFixture<NgModelGroupExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgModelGroupExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgModelGroupExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
