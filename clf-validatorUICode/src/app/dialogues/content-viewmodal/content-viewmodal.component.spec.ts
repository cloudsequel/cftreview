import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContentViewmodalComponent } from './content-viewmodal.component';

describe('ContentViewmodalComponent', () => {
  let component: ContentViewmodalComponent;
  let fixture: ComponentFixture<ContentViewmodalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContentViewmodalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContentViewmodalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
