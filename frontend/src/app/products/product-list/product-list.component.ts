import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Array<any>;
  
  constructor(private  productsService: ProductsService, private router: Router) { }
 
  ngOnInit() {
    this.productsService.getAll().subscribe(data =>{
      this.products = data;
    });
  }

  deleteProduct(product){
    
    this.productsService.deleteProduct(product).subscribe(result =>{
      this.router.navigate(['/products']);
    }, error => console.error(error))
  }

  productDetails(product){
    
  }

}
 