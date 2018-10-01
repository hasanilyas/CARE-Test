import { Component, OnInit } from '@angular/core';
import { WarehousesService } from '../../warehouses.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-warehouse-list',
  templateUrl: './warehouse-list.component.html',
  styleUrls: ['./warehouse-list.component.css']
})
export class WarehouseListComponent implements OnInit {
  warehouses: Array<any>;
  
  constructor(private  warehousesService: WarehousesService, private router: Router) { }
 
  ngOnInit() {
    this.warehousesService.getAll().subscribe(data =>{
      this.warehouses = data;
    });
  }

  deleteWarehouse(warehouse){
    
    this.warehousesService.deleteWarehouse(warehouse).subscribe(result =>{
      this.router.navigate(['/warehouses']);
    }, error => console.error(error))
  }

  warehouseDetails(warehouse){
    
  }

}
