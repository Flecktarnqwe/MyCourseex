package com.company.course.view.outgoingshipmentdetail;

import com.company.course.entity.OutgoingShipmentDetail;
import com.company.course.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "outgoingShipmentDetails/:id", layout = MainView.class)
@ViewController(id = "OutgoingShipmentDetail.detail")
@ViewDescriptor(path = "outgoing-shipment-detail-detail-view.xml")
@EditedEntityContainer("outgoingShipmentDetailDc")
public class OutgoingShipmentDetailDetailView extends StandardDetailView<OutgoingShipmentDetail> {
}