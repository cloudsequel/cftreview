import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OnloadscreenComponent } from './onloadscreen.component';

describe('OnloadscreenComponent', () => {
  let component: OnloadscreenComponent;
  let fixture: ComponentFixture<OnloadscreenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OnloadscreenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OnloadscreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
