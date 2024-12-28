package com.company.course.view.storagelocation;

import com.company.course.entity.StorageLocation;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "storageLocations", layout = MainView.class)
@ViewController(id = "StorageLocation.list")
@ViewDescriptor(path = "storage-location-list-view.xml")
@LookupComponent("storageLocationsDataGrid")
@DialogMode(width = "64em")
public class StorageLocationListView extends StandardListView<StorageLocation> {
}