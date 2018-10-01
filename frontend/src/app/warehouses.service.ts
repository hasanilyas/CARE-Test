import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'

@Injectable()
export class WarehousesService {

  constructor(private http:HttpClient) {
  }
 
  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/warehouses');
  }

  deleteWarehouse(warehouse: string){  
    return this.http.delete('//localhost:8080/warehouses/delete/' + warehouse);
  }

  addWarehouse(formdata : any): Observable<any>{
    let result: Observable<Object>
    result=this.http.post('//localHost:8080/warehouses/add', formdata);
    return result
  }

}
