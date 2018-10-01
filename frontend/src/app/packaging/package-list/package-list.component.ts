import { Component, OnInit } from '@angular/core';
import { PackagingService } from '../../packaging.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-package-list',
  templateUrl: './package-list.component.html',
  styleUrls: ['./package-list.component.css']
})
export class PackageListComponent implements OnInit {

  packagingmaterials: Array<any>;
  
  constructor(private  packagingsService: PackagingService, private router: Router) { }
 
  ngOnInit() {
    this.packagingsService.getAll().subscribe(data =>{
      this.packagingmaterials = data;
    });
  }

  deletePackaging(packaging){
    
    this.packagingsService.deletePackagingmaterial(packaging).subscribe(result =>{
      this.router.navigate(['/packagingmaterials']);
    }, error => console.error(error))
  }

  packagingDetails(packaging){
    
  }

}
 