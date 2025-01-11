import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormControlExampleComponent } from './form-control-example.component';

describe('FormControlExampleComponent', () => {
  let component: FormControlExampleComponent;
  let fixture: ComponentFixture<FormControlExampleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormControlExampleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormControlExampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
