import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddPackagingComponent } from './add-packaging.component';

describe('AddPackagingComponent', () => {
  let component: AddPackagingComponent;
  let fixture: ComponentFixture<AddPackagingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddPackagingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddPackagingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
