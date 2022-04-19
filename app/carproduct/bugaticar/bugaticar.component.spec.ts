import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BugaticarComponent } from './bugaticar.component';

describe('BugaticarComponent', () => {
  let component: BugaticarComponent;
  let fixture: ComponentFixture<BugaticarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BugaticarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BugaticarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
