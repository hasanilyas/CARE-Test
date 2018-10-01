import { Component, OnInit } from '@angular/core';
import { WarehousesService } from '../../warehouses.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-warehouse',
  templateUrl: './add-warehouse.component.html',
  styleUrls: ['./add-warehouse.component.css']
})
export class AddWarehouseComponent implements OnInit {
  warehouse : any = {};
  constructor(private  warehousesService: WarehousesService, private router: Router) { }

  ngOnInit() {
  }
 
  Add(formdata){
    console.log(formdata);
    this.warehousesService.addWarehouse(formdata).subscribe(result =>{
    this.router.navigate(['/warehouses/add']);
    }, error => console.error(error))
  }
}
