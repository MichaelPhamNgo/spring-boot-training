import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocalVariableComponent } from './local-variable.component';

describe('LocalVariableComponent', () => {
  let component: LocalVariableComponent;
  let fixture: ComponentFixture<LocalVariableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LocalVariableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LocalVariableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
