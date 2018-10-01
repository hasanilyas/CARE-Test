import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'
@Injectable()
export class ProductsService {

  constructor(private http:HttpClient) {
  }
 
  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/products');
  }

  deleteProduct(product: string){  
    return this.http.delete('//localhost:8080/products/delete/' + product);
  }

  addProduct(formdata : any): Observable<any>{
    let result: Observable<Object>
    result=this.http.post('//localHost:8080/products/add', formdata);
    return result
  } 
}
