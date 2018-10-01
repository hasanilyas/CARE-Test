import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../products.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  product : any = {};

  constructor(private  productsService: ProductsService, private router: Router) { }

  ngOnInit() {
  }
 
  Add(formdata){
    console.log(formdata);
    this.productsService.addProduct(formdata).subscribe(result =>{
    this.router.navigate(['/products/add']);
    }, error => console.error(error))
  }

}
