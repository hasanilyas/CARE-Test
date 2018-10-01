import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'

@Injectable()
export class PackagingService {

  constructor(private http:HttpClient) {
  }
 
  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/packagingmaterials');
  }

  deletePackagingmaterial(packagingmaterial: string){  
    return this.http.delete('//localhost:8080/packagingmaterials/delete/' + packagingmaterial);
  }

  addPackagingmaterial(formdata : any): Observable<any>{
    let result: Observable<Object>
    result=this.http.post('//localHost:8080/packagingmaterials/add', formdata);
    return result
  }
 
}
