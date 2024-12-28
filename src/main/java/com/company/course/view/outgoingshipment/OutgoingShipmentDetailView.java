package com.company.course.view.outgoingshipment;

import com.company.course.entity.OutgoingShipment;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "outgoingShipments/:id", layout = MainView.class)
@ViewController(id = "OutgoingShipment.detail")
@ViewDescriptor(path = "outgoing-shipment-detail-view.xml")
@EditedEntityContainer("outgoingShipmentDc")
public class OutgoingShipmentDetailView extends StandardDetailView<OutgoingShipment> {
}