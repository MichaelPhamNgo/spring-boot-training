import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NestedFormGroupExampleComponent } from './nested-form-group-example.component';

describe('NestedFormGroupExampleComponent', () => {
  let component: NestedFormGroupExampleComponent;
  let fixture: ComponentFixture<NestedFormGroupExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NestedFormGroupExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NestedFormGroupExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
