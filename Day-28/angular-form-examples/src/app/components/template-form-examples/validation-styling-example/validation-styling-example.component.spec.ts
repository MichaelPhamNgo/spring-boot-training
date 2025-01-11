import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidationStylingExampleComponent } from './validation-styling-example.component';

describe('ValidationStylingExampleComponent', () => {
  let component: ValidationStylingExampleComponent;
  let fixture: ComponentFixture<ValidationStylingExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ValidationStylingExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ValidationStylingExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
