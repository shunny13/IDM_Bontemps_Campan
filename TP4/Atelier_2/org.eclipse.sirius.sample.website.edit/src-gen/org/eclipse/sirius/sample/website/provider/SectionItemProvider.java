/**
 */
package org.eclipse.sirius.sample.website.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.sirius.sample.website.WebsitePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.sample.website.Section} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SectionItemProvider extends ContentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSubParagraphsPropertyDescriptor(object);
			addSubImagesPropertyDescriptor(object);
			addSubLinksPropertyDescriptor(object);
			addSubButtonsPropertyDescriptor(object);
			addChildSectionsPropertyDescriptor(object);
			addParentSectionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Paragraphs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubParagraphsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_subParagraphs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_subParagraphs_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__SUB_PARAGRAPHS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Images feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubImagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_subImages_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_subImages_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__SUB_IMAGES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_subLinks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_subLinks_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__SUB_LINKS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Buttons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubButtonsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_subButtons_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_subButtons_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__SUB_BUTTONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Child Sections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildSectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_childSections_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_childSections_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__CHILD_SECTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Parent Sections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentSectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Section_parentSections_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Section_parentSections_feature",
								"_UI_Section_type"),
						WebsitePackage.Literals.SECTION__PARENT_SECTIONS, true, false, true, null, null, null));
	}

	/**
	 * This returns Section.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Section"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Section_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
