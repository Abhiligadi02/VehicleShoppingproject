import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BikeproductComponent } from './bikeproduct.component';

describe('BikeproductComponent', () => {
  let component: BikeproductComponent;
  let fixture: ComponentFixture<BikeproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BikeproductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BikeproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
