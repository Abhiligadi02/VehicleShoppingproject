import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarproductComponent } from './carproduct.component';

describe('CarproductComponent', () => {
  let component: CarproductComponent;
  let fixture: ComponentFixture<CarproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarproductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CarproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
