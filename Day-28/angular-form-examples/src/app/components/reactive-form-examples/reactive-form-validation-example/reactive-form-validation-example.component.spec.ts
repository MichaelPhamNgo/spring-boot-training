import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveFormValidationExampleComponent } from './reactive-form-validation-example.component';

describe('ReactiveFormValidationExampleComponent', () => {
  let component: ReactiveFormValidationExampleComponent;
  let fixture: ComponentFixture<ReactiveFormValidationExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReactiveFormValidationExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReactiveFormValidationExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
