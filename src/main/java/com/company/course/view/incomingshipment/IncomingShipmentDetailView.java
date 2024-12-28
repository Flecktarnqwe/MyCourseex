package com.company.course.view.incomingshipment;

import com.company.course.entity.IncomingShipment;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "incomingShipments/:id", layout = MainView.class)
@ViewController(id = "IncomingShipment.detail")
@ViewDescriptor(path = "incoming-shipment-detail-view.xml")
@EditedEntityContainer("incomingShipmentDc")
public class IncomingShipmentDetailView extends StandardDetailView<IncomingShipment> {
}