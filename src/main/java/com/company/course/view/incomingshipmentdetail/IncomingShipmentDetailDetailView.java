package com.company.course.view.incomingshipmentdetail;

import com.company.course.entity.IncomingShipmentDetail;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "incomingShipmentDetails/:id", layout = MainView.class)
@ViewController(id = "IncomingShipmentDetail.detail")
@ViewDescriptor(path = "incoming-shipment-detail-detail-view.xml")
@EditedEntityContainer("incomingShipmentDetailDc")
public class IncomingShipmentDetailDetailView extends StandardDetailView<IncomingShipmentDetail> {
}