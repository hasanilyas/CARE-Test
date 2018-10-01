import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './nav/header/header.component';
import { FooterComponent } from './nav/footer/footer.component';
import { WarehouseListComponent } from './warehouses/warehouse-list/warehouse-list.component';
import { AddWarehouseComponent } from './warehouses/add-warehouse/add-warehouse.component';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { WarehousesService } from './warehouses.service';
import { HttpClientModule } from '@angular/common/http';
import { Angular2FontawesomeModule } from 'angular2-fontawesome/angular2-fontawesome';
import { ProductListComponent } from './products/product-list/product-list.component';
import { AddProductComponent } from './products/add-product/add-product.component';
import { ComponentListComponent } from './components/component-list/component-list.component';
import { AddComponentComponent } from './components/add-component/add-component.component';
import { PackageListComponent } from './packaging/package-list/package-list.component';
import { AddPackagingComponent } from './packaging/add-packaging/add-packaging.component';
import { RawmaterialListComponent } from './rawmaterials/rawmaterial-list/rawmaterial-list.component';
import { AddRawmaterialComponent } from './rawmaterials/add-rawmaterial/add-rawmaterial.component';
import { ProductsService } from './products.service';
import { ComponentsService } from './components.service';
import { PackagingService } from './packaging.service';
import { RawmaterialService } from './rawmaterial.service';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    WarehouseListComponent,
    AddWarehouseComponent,
    ProductListComponent,
    AddProductComponent,
    ComponentListComponent,
    AddComponentComponent,
    PackageListComponent,
    AddPackagingComponent,
    RawmaterialListComponent,
    AddRawmaterialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    Angular2FontawesomeModule,
    FormsModule
  ],
  providers: [WarehousesService, ProductsService, ComponentsService, PackagingService, RawmaterialService],
  bootstrap: [AppComponent]
})
export class AppModule { }
