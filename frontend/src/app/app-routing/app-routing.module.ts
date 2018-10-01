import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {Routes, RouterModule} from '@angular/router';
import { WarehouseListComponent } from '../warehouses/warehouse-list/warehouse-list.component';
import { AddWarehouseComponent } from '../warehouses/add-warehouse/add-warehouse.component';
import { ProductListComponent } from '../products/product-list/product-list.component';
import { AddProductComponent } from '../products/add-product/add-product.component';
import { ComponentListComponent } from '../components/component-list/component-list.component';
import { AddComponentComponent } from '../components/add-component/add-component.component';
import { PackageListComponent } from '../packaging/package-list/package-list.component';
import { AddPackagingComponent } from '../packaging/add-packaging/add-packaging.component';
import { RawmaterialListComponent } from '../rawmaterials/rawmaterial-list/rawmaterial-list.component';
import { AddRawmaterialComponent } from '../rawmaterials/add-rawmaterial/add-rawmaterial.component';


const appRoutes: Routes =[
  { path: '', redirectTo:'warehouses', pathMatch: 'full'},
  { path: 'warehouses', component: WarehouseListComponent },
  { path: 'warehouses/add', component: AddWarehouseComponent },
  { path: 'products', component: ProductListComponent},
  { path: 'products/add', component: AddProductComponent},
  { path: 'components', component: ComponentListComponent},
  { path: 'components/add', component: AddComponentComponent},
  { path: 'packagingmaterials', component: PackageListComponent},
  { path: 'packagingmaterials/add', component: AddPackagingComponent},
  { path: 'rawmaterials', component: RawmaterialListComponent},
  { path: 'rawmaterials/add', component: AddRawmaterialComponent},
  
  
]


@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(appRoutes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
