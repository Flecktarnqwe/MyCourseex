package com.company.course.view.storagelocation;

import com.company.course.entity.StorageLocation;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "storageLocations/:id", layout = MainView.class)
@ViewController(id = "StorageLocation.detail")
@ViewDescriptor(path = "storage-location-detail-view.xml")
@EditedEntityContainer("storageLocationDc")
public class StorageLocationDetailView extends StandardDetailView<StorageLocation> {
}