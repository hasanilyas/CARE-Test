import { Component, OnInit } from '@angular/core';
import { PackagingService } from '../../packaging.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-packaging',
  templateUrl: './add-packaging.component.html',
  styleUrls: ['./add-packaging.component.css']
})
export class AddPackagingComponent implements OnInit {
  packaging : any = {};
  constructor(private  packagingService: PackagingService, private router: Router) { }

  ngOnInit() {
  }
 
  Add(formdata){
    console.log(formdata);
    this.packagingService.addPackagingmaterial(formdata).subscribe(result =>{
    this.router.navigate(['/packagingmaterials/add']);
    }, error => console.error(error))
  }
}
